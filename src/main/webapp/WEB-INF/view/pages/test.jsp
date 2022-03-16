<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Autocomplete - Remote with caching</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
  .ui-autocomplete-loading {
    background: white url("img/ui-anim_basic_16x16.gif") right center no-repeat;
  }
  </style>
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
    var cache = {};
    $( ".a" ).autocomplete({
      //minLength: 2,
      source: function( request, response ) {
        var term = request.term;
        if ( term in cache ) {
          response( cache[ term ] );
          return;
        }
        $.getJSON( "/api/search/m1/"+term, request, function( data, status, xhr ) {
          cache[ term ] = data;
          response( data );
        });
      },
    select: function (event, ui) {
        var label = ui.item.label;
        var value = ui.item.value;
       //store in session
      //alert(label + " == " + value);
    }
    });
    
  } );
  </script>
</head>
<body>
 
  <label>A: </label>
  <input class="a">
  <label>B: </label>
  <input class="a">
  <label>C: </label>
  <input class="a">
 
 
</body>
</html>
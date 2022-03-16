$(document).ready(function() {

  table = $('#example').DataTable({
    "processing": true,
    "serverSide": true,
    bFilter: true,
    "lengthChange": false,
    orderCellsTop: true,
    searching: true,
    "scrollX": true,
    pagingType: "full_numbers",
    ajax: {
      "url": '/records?' + new Date().getMilliseconds(),
      "data": function(data) {
        planify(data);
      }
    },
    "columns": [{
        "data": "mid1.code",
        class: "widthTab",
        render: function(data, type, row, meta) {
          data = manageMasterData(row.mid1.code);
          return data;
        }
      },
      {
        "data": "mid2.code",
        class: "widthTab",
        render: function(data, type, row, meta) {
          data = manageMasterData(row.mid2.code);
          return data;
        }
      },
      {
        "data": "mid3.code",
        class: "widthTab",
        render: function(data, type, row, meta) {
          data = manageMasterData(row.mid3.code);
          return data;
        }
      },
      {
        "data": "mid4.code",
        class: "widthTab",
        render: function(data, type, row, meta) {
          data = manageMasterData(row.mid4.code);
          return data;
        }
      },
      {
        "data": "mid5.code",
        class: "widthTab",
        render: function(data, type, row, meta) {
          data = manageMasterData(row.mid5.code);
          return data;
        }
      },
      {
        "data": "clinic1",
        class: "widthTab",
      },
      {
        "data": "clinic2",
        class: "widthTab",
      },
      {
        "data": "clinic3",
        class: "widthTab",
      },
      {
        "data": "clinic4",
        class: "widthTab",
      },
      {
        "data": "clinic5",
        class: "widthTab",
      },
      {
        "data": "clinic6",
        class: "widthTab",
      },
      {
        "data": "clinic7",
        class: "widthTab",
      },
      {
        "data": "clinic8",
        class: "widthTab",
      },
      {
        "data": "clinic9",
        class: "widthTab",
      },
      {
        "data": "clinic10",
        class: "widthTab",
      },
      {
        "data": "clinic11",
        class: "widthTab",
      },
      {
        "data": "clinic12",
        class: "widthTab",
      },
      {
        "data": "clinic13",
        class: "widthTab",
      },
      {
        "data": "clinic14",
        class: "widthTab",
      },
      {
        "data": "clinic15",
        class: "widthTab",
      }

    ],
    order: [
      [0, "asc"]
    ],
  });

  function planify(data1) {
    for (let i = 0; i < data1.columns.length; i++) {
      column = data1.columns[i];
      if (column.search.value != "")
        console.log(column.search.value);
      column.searchRegex = column.search.regex;
      column.searchValue = column.search.value;
      delete(column.search);
    }
  }

  function manageMasterData(key) {
    const data = ['Therapeutic Area (TA)', 'Disease Area', 'Drug', 'LOT', 'MOA'];
    let html = "<select>"
    html += "<option>Select One</option>";
    for (let i = 0; i < data.length; i++) {
      if (data[i] == key)
        html += "<option selected>" + data[i] + "</option>";
      else
        html += "<option>" + data[i] + "</option>";
    }
    html += "</select>"
    return html;
  }
  $("table").delegate("input", "keyup", function() {
  let searchVal = $(this).val();
	let index = parseInt($(this).attr("col"));
  if(searchVal.length < 2) {
  		table.column(index).search('').draw();
  }
    $(this).autocomplete({
      minLength: 2,
      source: function(request, response) {
        var term = request.term;
        let url = "/api/search/"
        $.getJSON("/api/search/" + index + "/" + term, request, function(data, status, xhr) {
          response(data);
        });
      },
      select: function(event, ui) {
        table.column(index).search(ui.item.value).draw();
      }
    });
  });
});

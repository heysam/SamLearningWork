var dataTable;
$(document).ready(function () {
    loadDataTable();
});
function loadDataTable() {
    //抓table 的id=tblData
    dataTable = $('#tblData').dataTable({
        "ajax": {
            "url": "/Admin/Category/GetAll" //API Calls   GetAll
        },
        "columns": [
            {
                "data": "Id",
                "data": "name", "width": "60%"
            },
            {
                "data": "id",
                "render": function (data) {
                    return `
                                        <div class="text-center">
                                            <a href="/Admin/Category/Upsert/${data}"
                                                class="btn btn-success text-white" style="cursor:pointer">
                                                <i class="fas fa-edit"></i>
                                            </a>
                                            <a href="" class="btn btn-danger text-white" style="cursor:pointer">
                                                <i class="fas fa-trash-alt"></i>
                                            </a>
                                        </div>
                                       `;
                }, "width": "40%"
            }
        ],
        "language": {
            "emptyTable": "no data found"
        },
        "width": "100%"
    })
}

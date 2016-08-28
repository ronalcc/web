<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<!-- 模态框（Modal） -->
<div class="modal fade" id="addModal" tabindex="-1" role="dialog"
     aria-labelledby="addModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="addModalLabel">
                    新增场馆类型
                </h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" role="form" id="addForm">
                    <br>
                    <br>
                    <div class="form-group">
                        <label for="venuestypeName" class="col-md-2 control-label">类型</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="venuestypeName" id="venuestypeName"
                                   placeholder="请输入类型">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="comments" class="col-md-2 control-label">说明</label>
                        <div class="col-md-6">
                  <textarea class="form-control" name="comments" id="comments" rows="3"
                            placeholder="请输入说明"/>
                        </div></div>

                </form>



            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" id="addButton" name="addButton">
                    提交
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<script type="text/javascript">
    $('#addButton').click(function () {
                addMav("Mav","venuesType");

            }
    );

</script>
</body>
</html>

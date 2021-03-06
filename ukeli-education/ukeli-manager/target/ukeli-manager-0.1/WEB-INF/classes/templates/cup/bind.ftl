
<div class="main-container ace-save-state" id="main-container">
    <div class="main-content">
        <div class="main-content-inner">
        
            <div class="page-content">
                <div class="row pb10 wb100">
                    <div class="col-xs-12 col-sm-8">
                        <form class="form-inline">
                            <div class="form-group">
                                <label for="keywordForBind">关键字：</label>
                                <input type="text" class="form-control" id="keywordForBind" placeholder="试题名称">
                            </div>
                            <button type="button" class="btn btn-purple btn-sm" id="searchbtnForBind"><span class="ace-icon fa fa-search icon-on-right bigger-110"></span>搜索</button>
                            <button type="button" class="btn btn-purple btn-sm" id="researchbtnForBind"><span class="ace-icon fa fa-search icon-on-right bigger-110"></span>重置</button>
                            <button type="button" class="btn btn-sm btn-default" id="bindBatch"><span class="ace-icon fa fa-bolt bigger-110"></span>绑定</button>
                        </form>
                    </div>
                   
                </div>

                <div class="row">
                    <div class="col-xs-12">
                        <div>
                            <table class="table table-striped table-bordered table-hover" id="contentTableForBind">
                                <thead>
                                <tr>
                                   <th class="hidden-xs center"><input type="checkbox" class="i-checks"/></th>
								   <th class="hidden-sm hidden-xs">编号</th>
									<th class="hidden-sm hidden-xs">试题类型</th>
									<th class="hidden-sm hidden-xs">试题名称</th>
									<th class="hidden-sm hidden-xs">最后修改时间</th>
									<!--<th class="hidden-sm hidden-xs">是否绑定</th>-->
                                    <!--<th style="border-right:#CCC solid 1px;">操作</th>-->
                                </tr>
                                </thead>

                                <tbody id="ajax-data-forbind">

                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>

            </div><!-- /.page-content -->
        </div>
      </div><!-- /.main-content -->
   </div> 
   <input name="cupId" id="cupId" type="hidden" value=${cupId!} />

<script src="${adminPath}/res/js/cup/bind.js?ver=${version}"></script>

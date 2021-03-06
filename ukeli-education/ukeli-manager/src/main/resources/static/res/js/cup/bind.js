
var bindSubjectTemplate ='{{each list as subject index}}'+
    '<tr>'+
    '   <td class="hidden-xs center" height="28">'+
    '       <label class="pos-rel">'+
    '       		<input class="i-checks" type="checkbox" id="{{subject.id}}">'+
    '       </label>'+
    '   </td>'+
    '   <td>{{ subject.iorder}}</td>'+
    '   <td>{{ subject.ext_stype}}</td>'+
    '   <td>{{ subject.name}}</td>'+
    '   <td class="hidden-xs">{{dateFormat(subject.edittime,\'yyyy-MM-dd hh:mm:ss\')}}</td>'+
    '   <td>'+
    '       <div class="action-buttons">' +
    '        <a class="btn btn-minier btn-default" href="javascript:bind({{subject.id}})" title="绑定"><i class="ace-icon fa fa-bolt"></i>绑定</a>'+
    '       </div>' +
    '   </td>'+
    '</tr>'+
    '{{/each}}'+
    '<tr>'+
    '    <td height="50"></td>'+
    '   <td  colspan="12" id="pagerForBind">'+
    '       <div class="fl" style="padding-top:7px"></div>'+
    '       <div align="left" class="fr">'+
    '           <ul class="pagination"></ul>'+
    '       </div>'+
    '   </td>'+
    '</tr>';




var cupId="";

$(function () {
    $("#searchbtnForBind").on('click',searchbtnForBind);
    $("#researchbtnForBind").on('click',reSearchForBind);
    $("#bindBatch").on('click',bindBatch);
    cupId=$("#cupId").val();
    Eymjs.page.init();
    searchbtnForBind();
});

/**
 * 搜索
 */
function searchbtnForBind() {
	pageForBind(1);
}
/**
 * 重置搜索
 */
function reSearchForBind() {
    $("#keyword").val('');
    searchbtnForBind();
}

function pageForBind(page){
    var keywordForBind = $("#keywordForBind").val();
    Eymjs.page.showForBind(Eymjs.ukeli.url.subject.BINDSUBLIST,{keywordForBind:keywordForBind,page:page,status:-1,slock:0,cupId:cupId},bindSubjectTemplate);
}


/**
 * 选择多个，绑定
 */
function bindBatch() {
    var ids= Eymjs.page.selectList("contentTableForBind");
    console.info(cupId+'------'+ids)
    if(ids){
        //Eymjs.page.delByids(ids,Eymjs.ukeli.url.exam.DELETE,"您确定要删除您选择的吗")
      Eymjs.page.bindFunction(cupId,ids,Eymjs.ukeli.url.cup.BINDBYID,"您确定要绑定试题吗?")
    }
}



/**
 * 绑定一个记录
 * @param id
 */
function bind(subjectId) {
	console.info(cupId+'------'+subjectId)
    Eymjs.dialog.showUrl('绑定试题',Eymjs.ukeli.url.cup.BINDADDSCORE,{cupId:cupId,subjectId:subjectId},500,300);
}






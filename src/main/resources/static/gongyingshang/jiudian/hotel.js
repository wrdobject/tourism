/*查询出数据*/
function queryTrainSchemeFY(yema){
    alert("第二步");
    var hotel_province = $("#cmbProvince").val();
    var hotel_city = $("#cmbCity").val();
    var hotel_county = $("#cmbArea").val();
    var hotel_name = $("#hotel_name").val();
    $.ajax({
        url:"hotelList",
        type:'post',
        data:{yema:yema,hotel_province:hotel_province,hotel_city:hotel_city,hotel_county:hotel_county,hotel_name:hotel_name},
        dataType:'json',
        async:true,
        success:showTrainSchemeTable
    });
}

/*根据查询出的数据放在正文中*/
function showTrainSchemeTable(pageInfo){
    alert("第三步");
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小
    var trainschemes = pageInfo.list;
    alert("数量:"+trainschemes.length);
    var html = '';
    $("#form_page").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = trainschemes.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var enterprise = trainschemes[i];
        html += '<div class="layui-col-md5 san">';
        html += '<a href="javascript:;" class="site-demo-active" data-url="hotel_show" data-id="hotel_show" data-title="酒店详情" data-type="tabAdd">';
        html += '<img src="/layui/images/' + enterprise.imageList[1].img_path + '" style="width: 250px; height: 110px; margin: 2px 3px 1px 16px; border: 1px solid silver;" />';
        html += '<h5 hotel_id="'+enterprise.hotel_id+'">&nbsp;&nbsp;&nbsp;&nbsp;【' + enterprise.hotel_name + '】</h5>';
        html += '<p>&nbsp;&nbsp;&nbsp;&nbsp;<span class="tit">联系人：' + enterprise.relationList[1].relation_name + '</span></p>';
        html += '<p>&nbsp;&nbsp;&nbsp;&nbsp;<span class="tit">联系电话：' + enterprise.hotel_phone + '</span></p>';
        html += '</a>';
        html += '</div>';
        $("#form_page").html(html);
    }


    //开启分页组件
    trainschemesPage(total,pageNum,pageSize);
}


/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function trainschemesPage(total,pageNum,pageSize){
    alert("第四步");
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'demo7', //注意，这里是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                    queryTrainSchemeFY(obj.curr);//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}

$(function () {
    alert("第一步");
    queryTrainSchemeFY(1);
    $("#sousuo").click(function(){
        queryTrainSchemeFY(1);
    });


    $('#form_page').on('click','.san', function() {
        var hotel_id = $(this).find('h5').attr('hotel_id');
        window.location.href="/hotelById?hotel_id="+hotel_id;
    });
});



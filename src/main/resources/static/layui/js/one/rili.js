$(function(){
	var LODOP;
});
function printview(){
	createPage();
	LODOP.PREVIEW(); //打印预览
}
function updatePrint(){
	createPage();
	LODOP.PRINT_SETUP();//打印维护
}
function print(){
	createPage();
	LODOP.PRINT_DESIGN();//直接打印
}

function createPage(){

	LODOP=getLodop();  //获取打印对象
	//var style="<style>"+document.getElementById("style").innerHTML+"</style>";//可修改css的名字style
	//var html=style+"<body>"+document.getElementById("xingcheng").innerHTML+"</body>";//可修改整个要打印页面的div名字xingcheng
var style="<style>"+document.getElementById("rili").innerHTML+"</style>";//可修改css的名字style
var html=style+"<body>"+document.getElementById("rr").innerHTML+"</body>";//可修改整个要打印页面的div名字xingcheng
	LODOP.SET_PRINT_STYLE("Bold",1); //字体加粗
	LODOP.ADD_PRINT_HTM(20,50,650,890,html); //打印HTML


}


	//LODOP.ADD_PRINT_TEXT(50,50,50,50,"已打印"); //打印文字
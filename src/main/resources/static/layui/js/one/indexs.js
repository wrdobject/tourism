$(function(){
	var LODOP;
});
function printview(){
	createPage();
	LODOP.PREVIEW(); //��ӡԤ��
}
function updatePrint(){
	createPage();
	LODOP.PRINT_SETUP();//��ӡά��
}
function print(){
	createPage();
	LODOP.PRINT_DESIGN();//ֱ�Ӵ�ӡ
}

function createPage(){
	
	LODOP=getLodop();  //��ȡ��ӡ����
	var style="<style>"+document.getElementById("style").innerHTML+"</style>";
	var html=style+"<body>"+document.getElementById("dy").innerHTML+"</body>";
	LODOP.SET_PRINT_STYLE("Bold",1); //����Ӵ�
	LODOP.ADD_PRINT_HTM(50,30,200,890,html); //��ӡHTML

}


	//LODOP.ADD_PRINT_TEXT(50,50,50,50,"�Ѵ�ӡ"); //��ӡ����
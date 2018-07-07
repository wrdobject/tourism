var app = new Vue({
  el: '#app',
  data: {
  		productQuntity:1
  },
  mounted:function(){
  	
  },
  methods:{
  	
  	changeMoney:function(way){
  		if(way>0){
  			this.productQuntity++;
  		}else{
  			this.productQuntity--;
  			if(this.productQuntity<1){
  				this.productQuntity=1;
  			}
  		}
  	}
  }
 
})

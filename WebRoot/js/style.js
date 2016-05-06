function update(){

	var address=document.getElementById('address');
	var length=document.getElementById('length');
	var weight=document.getElementById('weight');
	var marry=document.getElementById('marry');
	var moneyCard=document.getElementById('moneyCard');
	var zhiwu=document.getElementById('zhiwu');
	var email=document.getElementById('email');
	var phone=document.getElementById('phone');
	
	
	if(address.value.length<5){
		alert("对不起，请输入正确的地址");
		address.focus();
		address.value="";
		address.style.backgroundColor="#FF0000";
		return ;
	}else{
		address.style.backgroundColor="#FFFFFF"
	}
	
	
	
	if(length.value<100||length.value>250){
		alert("对不起，请输入正确的身高");
		length.focus();
		length.value="";
		length.style.backgroundColor="#FF0000";
		return ;
	}else{
		length.style.backgroundColor="#FFFFFF"
	}
	
	if(weight.value<30||weight.value>250){
		alert("对不起，请输入正确的体重");
		weight.focus();
		weight.value="";
		weight.style.backgroundColor="#FF0000";
		return ;
	}else{
		weight.style.backgroundColor="#FFFFFF"
	}
	
	
	if(marry.value!='未婚'&&marry.value!='离异'&&marry.value!='已婚'&&marry.value!='丧偶'){
		alert("对不起，请输入正确的婚姻状态：未婚，离异，已婚，丧偶");
		marry.focus();
		marry.value="";
		marry.style.backgroundColor="#FF0000";
		return ;
	}else{
		marry.style.backgroundColor="#FFFFFF"
	}
	
	
	var moneyCardReg = /^(\d{16}|\d{19})$/;
	if(!moneyCardReg.test(moneyCard.value)){
		alert("您输入的银行卡号有误，请重新输入");
		moneyCard.focus();
		moneyCard.value="";
		moneyCard.style.backgroundColor="#FF0000";
		return ;
	}else{
		moneyCard.style.backgroundColor="#FFFFFF"
	}
	
	
	if(zhiwu.value==""){
		alert("对不起，职务不能为空，若无，则为无");
		zhiwu.focus();
		zhiwu.value="";
		zhiwu.style.backgroundColor="#FF0000";
		return ;
	}else{
		zhiwu.style.backgroundColor="#FFFFFF"
	}
	
	
	
	var emailReg =/^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$/;;
	if(!emailReg.test(email.value)){
		alert("您输入的邮箱有误，请重新输入");
		email.focus();
		email.value="";
		email.style.backgroundColor="#FF0000";
		return ;
	}else{
		email.style.backgroundColor="#FFFFFF"
	}
	
	var phoneReg=/^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$/;
	if(!phoneReg.test(phone.value)){
		alert("您输入的手机号有误，请重新输入");
		phone.focus();
		phone.value="";
		phone.style.backgroundColor="#FF0000";
		return ;
	}else{
		phone.style.backgroundColor="#FFFFFF"
	}
	

	 http_request = false;
     if (window.XMLHttpRequest) {     // Mozilla……等非IE浏览器
         http_request = new XMLHttpRequest();	//创建XMLHttpRequest对象
     } else if (window.ActiveXObject) {     // IE浏览器
         try {
             http_request = new ActiveXObject("Msxml2.XMLHTTP");	//创建XMLHttpRequest对象
         } catch (e) {
             try {
                 http_request = new ActiveXObject("Microsoft.XMLHTTP");	//创建XMLHttpRequest对象
            } catch (e) {}
         }
     }
     if (!http_request) {
         alert("不能创建XMLHttpRequest对象实例！");
         return false;
     }
     var url='http://localhost:8080/test_ssh/student/updateStudent?address='+address.value+'&length='+length.value+'&weight='+weight.value+'&marry='+marry.value+'&moneyCard='+moneyCard.value+'&zhiwu='+zhiwu.value+'&email='+email.value+'&phone='+phone.value;
     http_request.onreadystatechange = getResult;     //调用返回结果处理函数
     http_request.open('POST',url , true);	//创建与服务器的连接
     http_request.send(null);
     alert("更新成功");
}	
function getResult(){
	if(xmlHttpRequest.readyState==4){
		if(xmlHttpRequest.status==20){
//			alert("更新成功");
		}else{
			alert("更新失败，请稍后重试");
		}
		
	}
}


function check(stuid,ks,id){
	
	http_request = false;
    if (window.XMLHttpRequest) {     // Mozilla……等非IE浏览器
        http_request = new XMLHttpRequest();	//创建XMLHttpRequest对象
    } else if (window.ActiveXObject) {     // IE浏览器
        try {
            http_request = new ActiveXObject("Msxml2.XMLHTTP");	//创建XMLHttpRequest对象
        } catch (e) {
            try {
                http_request = new ActiveXObject("Microsoft.XMLHTTP");	//创建XMLHttpRequest对象
           } catch (e) {}
        }
    }
    if (!http_request) {
        alert("不能创建XMLHttpRequest对象实例！");
        return false;
    }
    var url='http://localhost:8080/test_ssh/college/shenhe?id='+stuid+'&ks='+ks;
    http_request.onreadystatechange = getResult;     //调用返回结果处理函数
    http_request.open('POST',url , true);	//创建与服务器的连接
    http_request.send(null);
    var button=document.getElementById(id);
    button.disabled=true;
    button.value="已审核";
}


function validate(){
	
	var editor=document.getElementById('myEditor');
	var title=document.getElementById('title');
	var str = editor.innerHTML.replace(/&/g, '%26');
	if(myEditor.innerHTML==""){
		alert('通知内容不得为空');
		return false;
	}
	if(title.value==""){
		alert('通知标题不得为空');
		title.focus();
		return false;
	}
	
	http_request = false;
    if (window.XMLHttpRequest) {     // Mozilla……等非IE浏览器
        http_request = new XMLHttpRequest();	//创建XMLHttpRequest对象
    } else if (window.ActiveXObject) {     // IE浏览器
        try {
            http_request = new ActiveXObject("Msxml2.XMLHTTP");	//创建XMLHttpRequest对象
        } catch (e) {
            try {
                http_request = new ActiveXObject("Microsoft.XMLHTTP");	//创建XMLHttpRequest对象
           } catch (e) {}
        }
    }
    if (!http_request) {
        alert("不能创建XMLHttpRequest对象实例！");
        return false;
    }
    var url='http://localhost:8080/test_ssh/advice/addAdvice?title='+title.value+'&content='+str;
    alert(url);
    http_request.onreadystatechange = getResult;     //调用返回结果处理函数
    http_request.open('POST',url , true);	//创建与服务器的连接
    http_request.send(null);
    alert('发布成功');
    editor.innerHTML="";
    title.value="";
}

function pass(stuid,examid,elemid){
	
	http_request = false;
    if (window.XMLHttpRequest) {     // Mozilla……等非IE浏览器
        http_request = new XMLHttpRequest();	//创建XMLHttpRequest对象
    } else if (window.ActiveXObject) {     // IE浏览器
        try {
            http_request = new ActiveXObject("Msxml2.XMLHTTP");	//创建XMLHttpRequest对象
        } catch (e) {
            try {
                http_request = new ActiveXObject("Microsoft.XMLHTTP");	//创建XMLHttpRequest对象
           } catch (e) {}
        }
    }
    if (!http_request) {
        alert("不能创建XMLHttpRequest对象实例！");
        return false;
    }
    var url='http://localhost:8080/test_ssh/college/pass?id='+stuid+'&ks='+examid;
    http_request.onreadystatechange = getResult;     //调用返回结果处理函数
    http_request.open('POST',url , true);	//创建与服务器的连接
    http_request.send(null);
    var button=document.getElementById(elemid);
    button.disabled=true;
    button.value="已通过";
}



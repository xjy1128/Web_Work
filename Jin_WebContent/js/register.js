/////////////////////////////验证码部分////////////////////////////////////////////////////////////////////////////////////////
		var show_num = [];
		draw(show_num);

		function dj() {
			draw(show_num);
		}

		function draw(show_num) {
			var canvas_width = document.getElementById('canvas').clientWidth;
			var canvas_height = document.getElementById('canvas').clientHeight;
			var canvas = document.getElementById("canvas"); //获取到canvas的对象，演员
			var context = canvas.getContext("2d"); //获取到canvas画图的环境，演员表演的舞台
			canvas.width = canvas_width;
			canvas.height = canvas_height;
			var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m";
			var aCode = sCode.split(",");
			var aLength = aCode.length; //获取到数组的长度

			for(var i = 0; i <= 3; i++) {
				var j = Math.floor(Math.random() * aLength); //获取到随机的索引值
				var deg = Math.random() * 30 * Math.PI / 180; //产生0~30之间的随机弧度
				var txt = aCode[j]; //得到随机的一个内容
				show_num[i] = txt;
				var x = 10 + i * 20; //文字在canvas上的x坐标
				var y = 20 + Math.random() * 8; //文字在canvas上的y坐标
				context.font = "bold 23px 微软雅黑";

				context.translate(x, y);
				context.rotate(deg);

				context.fillStyle = randomColor();
				context.fillText(txt, 0, 0);

				context.rotate(-deg);
				context.translate(-x, -y);
			}
			for(var i = 0; i <= 5; i++) { //验证码上显示线条
				context.strokeStyle = randomColor();
				context.beginPath();
				context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
				context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
				context.stroke();
			}
			for(var i = 0; i <= 30; i++) { //验证码上显示小点
				context.strokeStyle = randomColor();
				context.beginPath();
				var x = Math.random() * canvas_width;
				var y = Math.random() * canvas_height;
				context.moveTo(x, y);
				context.lineTo(x + 1, y + 1);
				context.stroke();
			}
		}

		function randomColor() { //得到随机的颜色值
			var r = Math.floor(Math.random() * 256);
			var g = Math.floor(Math.random() * 256);
			var b = Math.floor(Math.random() * 256);
			return "rgb(" + r + "," + g + "," + b + ")";
		}
/////////////////////验证码部分/////////////////////////////////////////////////////////////////////////////////////////////

////设置生日选择框不能选择当前日期以后的时间

function gettimenow(){
       //得到当前时间
	var date_now = new Date();
	//得到当前年份
	var year = date_now.getFullYear();
	//得到当前月份
	//注：
	//  1：js中获取Date中的month时，会比当前月份少一个月，所以这里需要先加一
	//  2: 判断当前月份是否小于10，如果小于，那么就在月份的前面加一个 '0' ， 如果大于，就显示当前月份
	var month = date_now.getMonth()+1 < 10 ? "0"+(date_now.getMonth()+1) : (date_now.getMonth()+1);
	//得到当前日子（多少号）
	var date = date_now.getDate() < 10 ? "0"+date_now.getDate() : date_now.getDate();
	//设置input标签的max属性
	var time=year+'-'+month+'-'+date;
	return time;
}

////校验表单的部分
function checkname()
{
	var name=document.getElementById("name").value;
	if(name=='')
	{
		alert("请输入用户名！");
		return false;
	}
	else if(name.length>10)
	{
		alert('用户名过长！请输入1-10位用户名');
		return false;
	}else{
		return true;
	}
}

function checkpassword()
{
	var psw1=document.getElementById("psw1").value;
	if(psw1=='')
	{
		alert("请输入密码！")
		return false;
	}
	else if(psw1.length<6)
	{
		alert("密码长度太短！");
		return false;
	}
	else if(psw1.length>18)
	{
		alert("密码长度太长！");
		return false;
	}else{
		return true;
	}
	
}

function checkpasswordagain()
{
	var psw1=document.getElementById("psw1").value;
	var psw2=document.getElementById("psw2").value;
	if(psw1!=psw2)
	{
		alert("请正确重复的密码！");
		return false;
	}else{
		return true;
	}
}

function checkemail()
{
// 利用正则表达式对输入数据匹配
   var email =  document.getElementById("email").value;
   if(email=='')
   {
   	alert('请输入邮箱')
   	return false;
   }
//以字母或数字开头，跟上@,字母数字以.com结尾
   var expr =  /^([0-9]|[a-z])+@([0-9]|[a-z])+(\.[c][o][m])$/i;
   if(!expr.test(email))
   {
      alert("输入的邮箱格式有误");
      return false;
   }else{
		return true;
	}
}

function checksex()
{
	var sex=document.getElementById("sex").value;
	if(sex=='unknown')
	{
		alert("请选择性别！");
		return false;
	}else{
		return true;
	}
}

function checkbirthday()
{
	var birthday=document.getElementById("birthday").value;
	if(birthday=='')
	{
		alert("请选择出生日期！")
		return false;
	}else{
		return true;
	}
}

function checkverifycode() {
			var verifyCode = document.getElementById("verifyCode").value;
			var num = show_num.join("");
			if(verifyCode == '') {
				alert('请输入验证码！');
				return false;
			} else if(verifyCode!=num){
				alert('验证码错误！\n你输入的是:  ' + verifyCode + "\n正确的是:  " + num + '\n请重新输入！');
				return false;
			}else{
		      return true;
	       }

		}


function checkform()
    {
    	
      if(checkname()&&checkemail()&&checkpassword()&&checkpasswordagain()&&checksex()&&checkbirthday()&&checkverifycode())
      {
      	alert('提交成功！')
        return true;  
      }else{
        return false;
      }
      
    }

//可以用但是特别会特别长
/*
function sublim() {
			var verifyCode = document.getElementById("verifyCode").value;
			var name=document.getElementById("name").value;
			var num = show_num.join("");
			if(name =='')
			{
				alert('请输入用户名');
				return false;
			}
			else if(name.length >18) {
				alert('用户名过长！');
				return false;
			}
			else if(verifyCode == '') {
				alert('请输入验证码！');
				return false;
			}
			else if(verifyCode != num) {
				alert('验证码错误！\n你输入的是:  ' + verifyCode + "\n正确的是:  " + num + '\n请重新输入！');
				return false;
			} 
			else{
				alert('提交成功！');
				return true;
			}

		}
*/	
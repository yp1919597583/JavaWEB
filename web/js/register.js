
window.onload=function () {

var x,y,z,w;
var input=document.querySelectorAll('input');
var p=document.querySelectorAll('p');
input[0].onblur=function () {

    if (this.value.length>8 || this.value.length<1 && this.value.length>0)
    {

        p[0].style.background='url(img/icoimg/错误.png) no-repeat left -7px';
        p[0].innerHTML='错误请输入1-8位';
        x=0;
    }else if(this.value.length<8 && this.value.length>1 ){
        p[0].style.background='url(img/icoimg/正确.png) no-repeat left -7px';
        p[0].innerHTML='输入正确!';
        x=1;
        pd()
    }
}
input[1].onblur=function () {
    var  flage=1;


    for (var i=0;i<this.value.length;i++){


        if(this.value[i]>='A' && this.value[i]<='Z' && this.value.length>=6 && this.value.length<13) {

            for (var i=0;i<this.value.length;i++){


                if(this.value[i]>='a' && this.value[i]<='z'){
                    console.log('1');
                    p[1].style.background='url(img/icoimg/正确.png) no-repeat left -7px';
                    p[1].innerHTML='输入正确!';
                    y=1;

                    flage=0;
                    break;

                }else {
                    p[1].style.background='url(img/icoimg/错误.png) no-repeat left -7px';
                    p[1].innerHTML='错误应包含大小写英文!';
                    y=0;
                }
            }

        }else if(flage==1){
            p[1].style.background='url(img/icoimg/错误.png) no-repeat left -7px';
            p[1].innerHTML='错误应包含6-12位大小写英文!';
            //y=0;
        }

    }




}
input[2].onblur=function () {
    for (var i=0;i<this.value.length;i++)
    {
        if (this.value.length==11 && this.value[i]>0 && this.value[i]<10 )
        {
            p[2].style.background='url(img/icoimg/正确.png) no-repeat left -7px';
            p[2].innerHTML='输入正确!';
            z=1;

            break;
        }else {
            p[2].style.background='url(img/icoimg/错误.png) no-repeat left -7px';
            p[2].innerHTML='电话号码错误!';
            z=0;

        }

    }

}
input[3].onblur=function () {
    for (var i=0;i<this.value.length;i++){
        if (this.value[i]=='@' && this.value.substr(length-4,4)=='.com'){
            p[3].style.background='url(img/icoimg/正确.png) no-repeat left -7px';
            p[3].innerHTML='输入正确!';
            w=1;
            break;
        }else {
            p[3].style.background='url(img/icoimg/错误.png) no-repeat left -7px';
            p[3].innerHTML='邮箱错误!';
            w=0;
        }
    }
}


function pd() {

    if (x==y==z==w==0)
    {
        return false;
    }else if(x==y==z==w==1) {
        return true;
    }

}

}
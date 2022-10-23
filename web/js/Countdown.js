$(function(){
    TIMEDOWN();//消除刷新时间的影响

        //setTimeout 只执行一次，setinterval每间隔时间就执行一次
        window.setInterval(TIMEDOWN, 1000);
        function TIMEDOWN(){
            var T=new Date();
            var MO=T.getMonth()+1;
            var HS=T.getHours()+2;
            var time= T.getFullYear()+'-'+MO+'-'+T.getDate()+' '+HS+':00'+':00';
           
            var nowTime=+new Date();
            var nowhours= T.getHours();//当前小时
          
           var inputtime=+new Date(time);
           var sysj=(inputtime-nowTime)/1000;//剩余秒数
           var hours=parseInt(sysj/60/60 % 24)//剩余小时
           var mains=parseInt( sysj/60 %60);//剩余分钟
           
           var s=parseInt( sysj % 60);//剩余秒;
            if(hours<10){
                hours='0'+hours;
            }
            if(mains<10){
                mains='0'+mains;
            }
            if(s<10){
                s='0'+s;
            }

            $('.Countdown span').eq(0).html(hours);

            $('.Countdown span').eq(1).html(mains);
            $('.Countdown span').eq(2).html(s);
            $('.time_ground').html(nowhours+':00'+"场");
            // span[0] .innerHTML=hours;
            // span[1].innerHTML=mains;
            // span[2].innerHTML=s;
            // strong.innerHTML=;
            
            
        }


});
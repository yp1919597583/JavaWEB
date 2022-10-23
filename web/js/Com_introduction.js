
$(function(){
    var num=0;
    $('.add_btn').on('click',function(){
        num=parseInt($('.inp').val())+1;
       
        $('.inp').val(num);

       
    });
    $('.sub_btn').on('click',function(){
        if(parseInt($('.inp').val())>=1){
            num=$('.inp').val()-1;
            $('.inp').val(num);
        }
      

    });

    //商品详情模块
    $('.a a').on('click',function(){
    $(this).addClass('a_current').siblings().removeClass();
    
    //加上索引
    var index=$(this).index();
    //下边显示
    $('.xq ul li').eq(index).show().siblings().hide();
  
    
    
    });

    //商品评论
    $('.issue').on('click',function(){
        if($('textarea').val() !=''){
            var li=$('<li></li>');
        
            $(li).html($('textarea').val());
           li.slideDown(500);
            $('.ly_nr').prepend(li);
            $('textarea').val('');

        }
       
        
    });
  

    
});
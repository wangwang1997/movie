function GetRowAndCol(row,col,mid,cid) {

    console.log(row,col,mid,cid)
        $.ajax({
            type: 'post',
            dataType: '',
            url: '/show/ChoosenSeat',
            data: {
                "row":row,
                "col":col,
                "mid":mid,
                "cid":cid
            },
            cache: false,
            async: true,
            success: function (data) {
                console.log(data)
                console.log(typeof data)
                if(data){
                    if($("."+row+col).attr('src') == '/image/seat.png'){
                        $(".foot").addClass("footsel").text(row+" 排 "+col+" 列")
                        if($("."+row+col).siblings().attr('src') == '/image/seat-green.png'){
                            $("."+row+col).attr('src','/image/seat.png')
                        }
                        $("."+row+col).attr('src','/image/seat-green.png');

                    }else{
                        $("."+row+col).attr('src','/image/seat.png')
                        $(".foot").removeClass("footsel").text("请先选座")
                    }

                }else{
                    console.log("已经被卖了")
                }
            }
        });

}

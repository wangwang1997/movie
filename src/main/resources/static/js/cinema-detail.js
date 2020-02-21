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
                    //console.log($(".sel-green").length);

                        if ($("." + row + col).attr('src') == '/image/seat.png'&&$(".sel-green").length <= 1) {
                            if($(".sel-green").length == 0){
                                $(".foot a").addClass("footsel").text(row + " 排 " + col + " 座");
                            }else{
                                let txt = $(".foot a").addClass("footsel").text()
                                $(".foot a").addClass("footsel").text(txt +" , "+ row + " 排 " + col + " 座")
                            }
                            $("." + row + col).attr('src', '/image/seat-green.png');
                            $("." + row + col).addClass("sel-green");

                        } else if ($("." + row + col).attr('src') == '/image/seat-green.png'){
                            if($(".sel-green").length == 1){
                                $(".foot a").removeClass("footsel").text("请先选座");
                            }else{
                                let txt = $(".foot a").addClass("footsel").text()
                                $(".foot a").text(txt.split(row + " 排 " + col + " 座").filter(
                                    function(n){
                                        console.log(n);
                                    }
                                ))
                            }
                            $("." + row + col).attr('src', '/image/seat.png');
                            //$(".foot").removeClass("footsel").text("请先选座");
                            $("." + row + col).removeClass("sel-green");

                    }else {
                        console.log("超过2个")
                    }


                }else{
                    console.log("已经被卖了")
                }
            }
        });

}






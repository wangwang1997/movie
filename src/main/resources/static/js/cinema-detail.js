function GetRowAndCol(row,col,mid) {

        $.ajax({
            type: 'post',
            dataType: '',
            url: '/show/ChoosenSeat',
            data: {
                "row":row,
                "col":col,
                "mid":mid
            },
            cache: false,
            async: true,
            success: function (data) {
                console.log(data)
                console.log(typeof data)
                if(data){
                   console.log("可以买")
                }else{
                    console.log("已经被卖了")
                }
            }
        });

}

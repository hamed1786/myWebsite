// chnage labelAdd2Cart to id label element
// change http://localhost:5050/cart.do to cart servlet url
// change data: prodName, quan,price
 $(document).ready(function() {
  $("#addToCart").click( 		// change with a new id label element
    function(){
     $.ajax({
            url: 'http://localhost:8080/cart',	// address for CheckOutServlet 
            type: 'post',
            data: {
            pname:$("#pname").val(),			//Customer Input for ProductName (pname).
            qty:$("#qty").val(),				//Customer Input for quantity (qty).
            pri:$("#pri").val()					//Customer Input for price (pri).
      },
            context: this,
             success: function (data) {
             console.log("success");
             },
            errorfunction (data) {
             console.log("failure");
            }
     });
  }
 );
     
  });

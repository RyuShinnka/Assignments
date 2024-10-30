<?php
$num = $_POST['num'];
if($num % 2 == 0){
    print $num."は偶数です";
}else{
    print $num."は奇数です";
}
?>
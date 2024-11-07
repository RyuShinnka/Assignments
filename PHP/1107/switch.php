<?php
$kuji = mt_rand(1, 6); // 乱数1から6まで
switch ($kuji) {
    case 1:
        print "大吉です";
        break;
    case 2:
        print "中吉です";
        break;
    case 3:
        print "小吉です";
        break;
    case 4:
        print "吉です";
        break;
    case 5:
        print "末吉です";
        break;
    default:
        print "凶です";
}
?>

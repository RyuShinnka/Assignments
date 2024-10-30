<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $year = $_POST['year'];
        if($year < 1868){
            print $year. "は明治以前です";
        }else if($year >= 1868 && $year <= 1911){
            print $year." 年は "."明治".($year-1867)."年です";
        }else if($year >= 1912 && $year <= 1925){
            print $year." 年は "."大正".($year-1911)."年です";
        }else if($year >= 1926 && $year <= 1988){
            print $year." 年は "."昭和".($year-1925)."年です";
        }else if($year >= 1989 && $year <= 2018){
            print $year." 年は "."平成".($year-1988)."年です";
        }else{
            print $year." 年は "."令和".($year-2018)."年です";
        }
    ?>
</body>
</html>
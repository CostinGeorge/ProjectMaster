<html>
<head>
<title>Prenos súboru pri safe_mod = On</title>
</head>
<body>
<?php

$uploaddir = "datatest/";
$uploadfile = $uploaddir . basename($_FILES["userfile"]["name"]);
if (move_uploaded_file($_FILES["userfile"]["tmp_name"], $uploadfile)) {
echo "subor bol uspesne nahrany. ";
} else {
echo "Subor sa nepodarilo nahrat. ";
}

?>
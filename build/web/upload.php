<?php
$file_result = “”;
if ($_FILES[“FILE”][“error”]>0){
$file_result .= “No file uploaded”;
 
$file_result = “error code: ” .$_FILES[“FILE”][“error”] . “<br>”;
}else{
move_uploaded_file($_FILES[“file”][“tmp_name”],
“/Users/Mato/Documents/” . $_FILES[“file”][“name”]);
 
$file_result .= “Success”;
}
?>

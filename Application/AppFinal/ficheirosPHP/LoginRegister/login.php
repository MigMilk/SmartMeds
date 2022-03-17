<?php
require "DataBase.php";
$db = new DataBase();
if (isset($_POST['user_login']) && isset($_POST['user_pass'])) {
    if ($db->dbConnect()) {
        if ($db->logIn("wp_users", $_POST['user_login'], $_POST['user_pass'])) {
            echo "Login Success";
        } else echo "Username or Password wrong";
    } else echo "Error: Database connection";
} else echo "All fields are required";
?>

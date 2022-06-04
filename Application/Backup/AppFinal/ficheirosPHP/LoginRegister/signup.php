<?php
require "DataBase.php";
$db = new DataBase();
if (isset($_POST['user_login']) && isset($_POST['user_email']) && isset($_POST['display_name']) && isset($_POST['user_pass'])) {
    if ($db->dbConnect()) {
        if ($db->signUp("wp_users", $_POST['user_login'], $_POST['user_email'], $_POST['display_name'], $_POST['user_pass'])) {
            echo "Sign Up Success";
        } else echo "Sign up Failed";
    } else echo "Error: Database connection";
} else echo "All fields are required";
?>

<?php

class DataBaseConfig
{
    public $servername;
    public $username;
    public $password;
    public $databasename;

    public function __construct()
    {

        $this->servername = 'localhost';
        $this->username = 'smartmeds';
        $this->password = 'smartmeds_123';
        $this->databasename = 'deti-smed';

    }
}
?>

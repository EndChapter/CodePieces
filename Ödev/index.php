<!DOCTYPE html>
<html>
  <head>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>

  <body>
    <?php
    include 'kontrol.php';
    $username= "root";
    $password= "1234";
    try{
      $dbh = new PDO('mysql:host=localhost;dbname=oturum', $username, $password);
      $dbh->query("SET CHARACTER SET utf8");;

    } catch (PDOException $e) {
      print "Hata!: " . $e->getMessage() . "<br/>";
      die();
    }
   ?>

    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>

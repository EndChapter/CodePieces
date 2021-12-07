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
        $username = "root";
        $password = "1234";
        try{
          $dbh = new PDO('mysql:host=localhost;dbname=oturum', $username, $password);
          $dbh->query("SET CHARACTER SET utf8");
        }catch(PDOException $e){
          print "Hata!: ".$e->getMessage(). "<br/>";
          die();
        }
        if(isset($_GET['id'])){
          if($_GET['id'] == 1){
            echo "<div class=\"row container\">
                   <div class=\"col s12 m6\">
                     <div class=\"card red hoverable\">
                       <div class=\"card-content white-text\">
                         <span class=\"card-title\">Kayıtlı Kullanıcı</span>
                         <p>Bu kullanıcı daha önce sistemimizde kayıtlıdır lütfen kayıtlı olmayan bilgiler ile giriş yapınız...</p>
                       </div>
                     </div>
                   </div>
                 </div>";
          }
        }

    ?>
    <div class="container">
      <div class="row">

        <form class="col s12" action="kontrol.php" method="post">
          <div class="row">
            <div class="input-field col s6">
              <input name="signupad" placeholder="Placeholder" type="text" class="validate"  >
              <label for="first_name">İsim</label>
            </div>
            <div class="input-field col s6">
              <input name="signupsoyad" type="text" class="validate" >
              <label for="last_name">Soyisim</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="signuppwd"  type="password" class="validate" >
              <label for="password">Şifre</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <input name="signupemail" type="email" class="validate" >
              <label for="email">Email</label>
            </div>
          </div>
          <button class="btn waves-effect waves-light" type="submit" name="action">KayıtOl
            <i class="material-icons right">send</i>
          </button>
        </form>
      </div>
    </div>
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>

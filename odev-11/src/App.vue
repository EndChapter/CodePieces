<template>
    <div class="container">
        <div v-if="!isSubmitted">
        <form>
            <div class="row">
                <div class="">
                    <!-- Soru 1 -->
                    <!-- Aşağıdaki bilgileri içeren bir Üye Ol sayfası geliştiriniz. -->
                    <!-- Tam Adı (Ad + Soyad) -->
                    <!-- E-mail -->
                    <!-- Şifre -->
                    <!-- Cinsiyet (Kadın/Erkek) -->
                    <form>
                        <div class="container">
                            <br><br><br><br>
                            <app-full-name v-model="fullname"></app-full-name>
                            <div class="col-md-12 form-group">
                                <label for="email">E-mail Adresi</label>
                                <input type="email" class="form-control" placeholder="E-mail Adresi" id="email" v-model="userData.email">
                            </div>
                            <div class="col-md-12 form-group">
                                <label for="pwd">Şifre</label>
                                <input type="password" class="form-control" placeholder="Şifre" id="pwd" v-model="userData.password">
                            </div>
                            <div class="col-md-12 form-group">
                                <label for="radiobutton">Cinsiyet: </label>
                                <input type="radio" value="Erkek" class="form-check-input" v-model="userData.gender"> Erkek
                                <input type="radio" value="Kadın" class="form-check-input" v-model="userData.gender"> Kadın
                            </div>
                            <div class="col-md-12">
                                <button class="btn-primary btn-sm btn" @click.prevent="isSubmitted = true">Gönder</button>
                            </div>

                        </div>


                    </form>
                    <!-- Soru 2 -->
                    <!-- Üye Ol formu, Submit EDİLMEDİĞİ SÜRECE ekranda gözükmelidir.-->
                    <!-- Üye Bilgileri Ekranı ise form Submit EDİLDİKTEN SONRA ekranda gözükecektir -->

                    <!-- Soru 3 -->
                    <!-- Yukarıdaki uygulamayı düzenleyerek Tam Ad (Ad + Soyad) alanı için bir Form Kontrol Elemanı üretiniz -->
                </div>
            </div>
        </form>
        </div>
        <div class="row" v-else>
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4>Girdiğiniz Bilgier</h4>
                    </div>
                    <div class="panel-body">
                        <p>Tam Ad: {{fullname}} </p>
                        <p>E-mail: {{userData.email}}</p>
                        <p>Şifre: {{userData.password}}</p>
                        <p>Cinsiyet: {{userData.gender}}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import FullName from "./FullName";

    export default {
        data(){
            return{
                userData : [{
                    email: "",
                    password: "",
                    gender: "",

                }],
                fullname: "",
                isSubmitted: false,
            }
        },
        components :{
            appFullName : FullName,
        }
    }
</script>

<style>
</style>

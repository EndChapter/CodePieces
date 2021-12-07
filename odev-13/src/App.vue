<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h3>Ödev 13</h3>
        <hr>
        <h4><strong>Soru 1</strong></h4>
        <!-- Soru 1 -->
        <!-- Girmiş olduğunuz yazıyı tersten yazacak bir Filter tanımı yapınız ve bunu <p> içerisinde uygulayınız -->
        <input type="text" v-model="paragraf">
        <p>{{paragraf | reverseString}}</p>

        <!-- Soru 2 -->
        <!-- Global bir Filter tanımlayarak size kelime sayısını ve kelimeyi veren bir Filter tanımı yapınız -->
        <!-- Örneğin : "videosinif.com" => videosinif.com (14) Şeklinde çıktı vermelidir -->
        <hr>
        <h4><strong>Soru 2</strong></h4>
        <input type="text" v-model="paragrafTwo">
        <p>{{paragrafTwo | arraysize}}</p>

        <!-- Soru 3 -->
        <!-- Soru 1 ve 2 deki uygulamaların aynısını Computed Property kullanarak yapınız -->
        <hr>
        <h4><strong>Soru 3</strong></h4>
        <input type="text" v-model="paragraf">
        <p>{{paragrafReverse}}</p>
        <input type="text" v-model="paragrafTwo">
        <p>{{paragrafSize}}</p>
        <!-- Soru 4 -->
        <!-- 3.Uygulamadaki Computed Property'leri bir Mixin aracılığı ile tanımlayarak tekrardan kodlarınızı düzenleyiniz-->
        <hr>
        <h4><strong>Soru 4</strong></h4>
        Uygulama içinde...
      </div>
    </div>
  </div>
</template>
<script>
  import paragMixin from "./assets/paragMixin";

  export default {
    mixins : [paragMixin],
    filters:{
      reverseString(data){
        return data.split('').reverse().join('').toLowerCase();
      }
    },
    data(){
      return {
        paragraf : "Deneme",
        paragrafTwo : "videosinif.com",
      }
    },
  }
</script>


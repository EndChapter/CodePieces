<template>
  <div>
    <div v-if="products.length == 0">

    </div>
    <div v-else>
      {{products[1].aciklama}}
    </div>
    <div class="container">
      <div class="row">
        <div class="col-12 mb-5 card mt-5 shadow">
          <div class="card-body">
            <h3>Ürün Listesi</h3>
            <hr>
            <table class="table table-hover table-striped table-bordered">
              <thead>
              <th>id</th>
              <th>Ürün Adı</th>
              <th>Adet</th>
              <th>Fiyat</th>
              <th>Açıklama</th>
              </thead>
              <tbody>
              <tr>
                <td class="align-middle text-center"><span class="badge badge-info"> E564fghdE563df </span></td>
                <td class="align-middle text-center"> Deneme </td>
                <td class="align-middle text-center"> 1 </td>
                <td style="width: 120px;"> 10,000</td>
                <td class="align-middle"> Örnek Açıklama</td>
              </tr>
              </tbody>
            </table>
            <div class="alert alert-warning">
              <strong>Henüz Burada Bir Kayıt Bulamadık</strong>
              <br>
              <small>Kayıt Eklemek için Ürün İşlemleri menüsünden yararlanabilirsiniz
              </small>
            </div>
          </div>
        </div>
      </div>
    </div>

    <nav class="navbar fixed-bottom  navbar-light" style="background-color: #e3f2fd;">
    <span class="navbar-text mr-auto">
        <strong>vuejsegitim.com</strong> | gkandemir
    </span>
      <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
        <strong>Alış Tutarı : </strong>
        <span class="badge badge-danger">34,56</span>
    </span>
      <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
        <strong>Satış Tutarı : </strong>
        <span class="badge badge-success">34,56</span>
    </span>
      <span class="navbar-text navbar-nav my-2 my-lg-0">
        <strong>Bakiye : </strong>
        <span class="badge badge-primary">34,56</span>
    </span>
    </nav>
  </div>
</template>

<script>
  import {mapActions} from 'vuex';
  import {mapGetters} from 'vuex';
    export default {
      data(){
        return{
        }
      },
      computed:{
        products(){
          return this.$store.getters.getProducts;
        },
        pro(){
          return this.products[1].aciklama;
        }
      },
      methods:{
          ...mapActions['getFirebaseProducts']
      },
      created() {
        this.$store.dispatch('getFirebaseProducts');
      }
    }
</script>

<style scoped>

</style>

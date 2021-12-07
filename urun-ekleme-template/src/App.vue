<template>
  <div class="container">
    <h1 class="text-center">Ürün Ekleme Uygulaması</h1>
    <hr>
    <div class="row">
      <app-select-image :product = "product"></app-select-image>
      <app-add-product :product = "product"></app-add-product>
    </div>
    <app-progress-bar :product = "product"></app-progress-bar>
    <app-product :product = "product"></app-product>

  </div>


</template>

<script>
  import SelectImage from "./components/SelectImage";
  import AddProduct from "./components/AddProduct";
  import ProgressBar from "./components/ProgressBar";
  import Product from "./components/Product";

  export default {
    components: {
      appSelectImage : SelectImage,
      appAddProduct : AddProduct,
      appProgressBar : ProgressBar,
      appProduct : Product,
    },
    data: function () {
      return{
        product : [],
      }
    }
  }
</script>

<style>
  body {
    background-color: aliceblue;
    padding-top: 20px;
    padding-bottom: 20px;
  }

  .card{
    margin-right: 5px;
    margin-bottom: 5px;
  }

  .card:last-child{
    margin-right: 0px;
  }

  .col-md-2{
    max-width: 15.666667%!important;
  }

  .product-container{
    margin-left: 15px;
  }

</style>


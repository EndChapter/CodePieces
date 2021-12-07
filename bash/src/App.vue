<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h3>Filter ve Mixins</h3>
        <p>{{message | toUpperCase | toLowerCase}}</p>
        <hr>
        <input type="text" v-model="searchText">
        <button class="btn btn-primary" @click = "products.push('Kamyon')">Ürün Ekle</button>
        <ul>
          <li v-for="product in filtered">{{product}}</li>
        </ul>
        <app-filter-list></app-filter-list>
      </div>
    </div>
  </div>
</template>

<script>
import FilterList from "./FilterList";
import {productMixin} from "./ProductMixin";

export default {
  mixins : [productMixin],
  components:{
    appFilterList: FilterList
  },
  data(){
    return{
      message : "Deneme",
      searchText: "",
    }
  },
  filters:{
    toUpperCase(value){
      return value.toUpperCase();
    }
  },
  created() {
    console.log('App.vue created')
  }
}
</script>

<style>

</style>

<template>
  <div class="container">
    <div class="row">
        <input type="text" v-model="searchText">
        <ul>
          <li v-for="product in filtered">{{product}}</li>
        </ul>
      </div>
    </div>
</template>

<script>
import {productMixin} from "./ProductMixin";

export default {
  mixins : [productMixin]
}
</script>

<style>

</style>

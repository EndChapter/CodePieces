<template>
  <div class="container-fluid pt-5">
    <h1 class="text-center">Yazı Listesi</h1>
    <hr>
    <div class="d-flex flex-wrap flex-row justify-content-center align-items-center" >
      <div class="card m-1" v-for="card in cards">
        <img class="card-img-top" :src="card.thumbnail" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">{{card.title}}</h5>
          <p class="card-text">{{card.previewText}}</p>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  import axios from 'axios';
  export default {
    data(){
      return{
        cards: []
      }
    },
    created() {
      axios.get('/posts.json')
      .then(response=>{
        for(let key in response.data){
          this.cards.push({...response.data[key], id: key});
        }
        console.log(response.data);
      }).catch(e=>console.log(e));
    }
  }
</script>
<style>
  .card {
    width: 300px;
  }
</style>

<template>
  <div class="col-xs-12 col-sm-6" v-if="Object.keys(serverData).length === 0">
    <p>Sunucu Bilgisi güncel değil!!</p>
  </div>
  <div class="col-xs-12 col-sm-6" v-else>
    <h3>Sunucu #{{serverData.id}}</h3>
    <p>Sunucu Durumu: <strong>{{serverData.status}}</strong></p>
    <button class="btn btn-primary btn-xs" @click="changeStatus">Sunucu Durumunu Düzelt</button>
  </div>
</template>
<script>
  import {eventBus} from "../../main";

  export default {
    data : function () {
      return{
        serverData : {}
      }
    },
    methods: {
      changeStatus(){
        this.serverData.status = "Normal";
      }
    },
    created() {
      eventBus.$on('sentData', (data)=>{
        this.serverData = data;
      })
    }
  }
</script>
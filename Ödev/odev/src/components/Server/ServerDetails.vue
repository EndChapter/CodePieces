<template>
  <div class="col-xs-12 col-sm-6">
    <p>Sunucu Bilgisi güncel değil!! Sunucu Durumu: {{st}}</p>
    <button @click="changeStatus" >Durumu Değiştir!!</button>
  </div>
</template>
<script>
  import {eventBus} from "../../main";

  export default {
    data : function () {
      return{
        st : "",
        changeSt: 2,
      }
    },
    methods:{
      changeStatus(){
        eventBus.changeStatusId(this.changeSt);
      }
    },
    created() {
      eventBus.$on('status',(stat)=>{
        this.st = stat;
      });
    },
  }
</script>
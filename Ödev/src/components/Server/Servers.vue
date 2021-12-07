<template>
  <div class="col-xs-12 col-sm-6">
    <ul class="list-group">
      <app-server-item :servers = "servers" @serverStatus = "svStatus = $event"></app-server-item>
    </ul>
  </div>
</template>

<script>
  import {eventBus} from "../../main";
  import ServerItem from "./ServerItem";

  export default {
    components : {'appServerItem': ServerItem},
    data: function () {
      return {
        svStatus :"",
        servers: [
          {id: 1, status: 'Kritik'},
          {id: 2, status: 'Normal'},
          {id: 3, status: 'Tehlikede'},
          {id: 4, status: 'Bilinmiyor..'},
        ]
      }
    },
    updated () {
      eventBus.$on('status', ()=>{
        this.svStatus = eve
      });
    }
  }
</script>
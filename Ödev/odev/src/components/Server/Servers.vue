<template>
  <div class="col-xs-12 col-sm-6">
    <ul class="list-group">
      <app-servers-li :data="servers" @emData="emitItem = $event"></app-servers-li>
    </ul>
  </div>
</template>

<script>
  import serversLi from './ServersLi';
  export default {
    components : {
      appServersLi : serversLi,
    },
    data : function () {
      return {
        servers : [
          {id: 1 , status: "Kritik"},
          {id: 2 , status: "Normal"},
          {id: 3 , status: "Tehlikede"},
          {id: 4 , status: "Bilinmiyor"},
        ],
        emitItem : "",
        }


      },
      updated(){

      }

    }

</script>
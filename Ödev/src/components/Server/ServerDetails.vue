<template>
  <div class="col-xs-12 col-sm-6">
    <p>Sunucu Bilgisi güncel değil!!{{status}}</p>
  </div>
</template>
<script>
  import {eventBus} from "../../main"
  export default {
    data: function () {
        return {
          status : eventBus.status,
        }
    }
  }
</script>
<template>
  <div>
    <lamp-status v-for="lamp in 5"></lamp-status>
    <hr>
  </div>
</template>

<script>
  import Lamp from "./LampStatus"
  export default {
    components : {
      "lamp-status" : Lamp
    }
  }
</script>

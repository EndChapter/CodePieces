<template>
    <div>
        <li
                class="list-group-item"
                v-for="server in servers" @click = 'changeStatus'>
            Sunucu Durumu: {{ server.status}}

        </li>
    </div>
</template>

<script>
    export default {
        name: "ServerItem",
        props:['servers'],
        methods: {
            changeStatus(){
              this.$emit('serverStatus', this.servers[3].status);
            },
        }
    }
</script>

<style scoped>

</style>
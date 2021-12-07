<template>
    <li class="list-group-item">
        Sunucu #{{ servers.id }}
        <p>Durumu: <strong>{{servers.status}}</strong></p>
    </li>
</template>

<script>
    export default {
        name: "Server",
        props : ['servers']
    }
</script>

<style scoped>

</style>
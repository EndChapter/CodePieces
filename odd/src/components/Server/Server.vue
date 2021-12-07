<template>
    <li class="list-group-item">
        Sunucu #{{ serverData.id }}
        <p>Durumu : <strong>{{serverData.status}}</strong></p>
    </li>
</template>

<script>
    export default {
        name: "Server",
        props:['serverData'],
    }
</script>

<style scoped>

</style>
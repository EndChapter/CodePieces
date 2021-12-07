<template>
    <ul class="nav nav-pills">
        <router-link
                active-class="active"
                to="/"
                exact
                tag="li">
            <a>Home</a>
        </router-link>
        <router-link active-class="active" to="/user" tag="li"><a>User</a>
        </router-link>
    </ul>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>

</style>
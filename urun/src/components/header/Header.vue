<template>
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #563F7A">
        <router-link :to="{name: 'UrunListe'}" exact-active-class="active">
            <a class="navbar-brand" href="#">Ürün Listesi</a>
        </router-link>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <router-link :to="{name: 'UrunGiris'}" active-class="active">
                        <a class="nav-link" href="#">Ürün İşlemleri</a>
                    </router-link>
                </li>
                <li class="nav-item">
                    <router-link :to="{name: 'UrunCikis'}" active-class="active">
                        <a class="nav-link" href="#">Ürün Çıkışı</a>
                    </router-link>
                </li>
            </ul>
        </div>
    </nav>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>

</style>

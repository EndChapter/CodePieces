<template>
    <nav class="navby" style="background-color: #563F7A">
        <router-link :to="{name: 'UrunListe'}" exact-active-class="active">
            <a class="nb aktif" href="#">Ürün Listesi</a>
        </router-link>
        <div class="clps">
            <ul class="nn">
                <li>
                    <router-link :to="{name: 'UrunGiris'}" active-class="active">
                        <a class="nlink" href="#">Ürün İşlemleri</a>
                    </router-link>
                </li>
                <li>
                    <router-link :to="{name: 'UrunCikis'}" active-class="active">
                        <a class="nlink" href="#">Ürün Çıkışı</a>
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

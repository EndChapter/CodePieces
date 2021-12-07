<template>
<div>
    <div class="container">
        <div class="same">
            <div class="mtb column1 rect">
                <div class="rect-body">
                    <h3>Ürün Listesi</h3>
                    <hr>
                    <div v-if="getProducts.length > 0">
                        <table class="tablo">
                            <thead>
                            <th class="th">id</th>
                            <th class="th">Ürün Adı</th>
                            <th class="th">Adet</th>
                            <th class="th">Fiyat</th>
                            <th class="th">Satış Fiyatı</th>
                            <th class="th">Açıklama</th>
                            </thead>
                            <tbody>
                            <tr v-for="product in getProducts">
                                <td class="ortala"><span class="back"> {{product.key}}</span></td>
                                <td class="ortala"> {{product.urunadi}}</td>
                                <td class="ortala" :class="getCurrencyClass(product)">{{product.adet - product.satisAdeti}}</td>
                                <td style="width: 120px;">{{product.fiyat | currency}}</td>
                                <td style="width: 120px;">{{product.satisFiyati | currency}}</td>
                                <td class="ortala">{{product.aciklama}}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="alert alert-warning" v-else>
                        <strong>Henüz Burada Bir Kayıt Bulamadık</strong>
                        <br>
                        <small>Kayıt Eklemek için Ürün İşlemleri menüsünden yararlanabilirsiniz
                        </small>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</template>

<script>
    import {mapGetters} from "vuex";
    export default {
        data(){
            return {
                green: 'green'
            }
        },
        computed:{
            ...mapGetters(["getProducts"]),


        },
        methods:{
            getCurrencyClass(product){
                return {
                    'btn-kirmizi' : product.adet - product.satisAdeti <= 0,
                    'btn-yesil' : product.adet - product.satisAdeti > 0,
                }
            },
        },
        created(){
            if(this.getProducts.length > 0 && this.getProducts[this.getProducts.length-1].key == undefined){
                this.$store.dispatch('getDBProds')
            }
        }
    }
</script>

<style>

</style>


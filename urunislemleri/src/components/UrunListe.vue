<template>
<div>
    <div class="container">
        <div class="row">
            <div class="col-12 mb-5 card mt-5 shadow">
                <div class="card-body">
                    <h3>Ürün Listesi</h3>
                    <hr class="hr">
                    <div v-if="products.length =! 0">
                        <table class="table table-hover table-striped table-bordered" v-for="product in products" :key="product.key">
                            <thead>
                            <th>id</th>
                            <th>Ürün Adı</th>
                            <th>Adet</th>
                            <th>Fiyat</th>
                            <th>Açıklama</th>
                            </thead>
                            <tbody>
                            <tr>
                                <td class="align-middle text-center"><span class="badge badge-info"> E564fghdE563df {{product.id}}</span></td>
                                <td class="align-middle text-center">{{product.urunadi}}</td>
                                <td class="align-middle text-center"> {{product.adet}} </td>
                                <td style="width: 120px;"> {{product.fiyat}}</td>
                                <td class="align-middle"> {{product.aciklama}}</td>
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
    export default {
        data(){
            return{

            }
        },
        computed:{
            products(){
                return this.$store.getters.getProducts;
            }
        },
        created() {
            // this.$store.dispatch('getDBProds');
        }
    }
</script>

<style scoped>

</style>


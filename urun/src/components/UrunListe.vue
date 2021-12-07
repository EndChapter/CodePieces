<template>
<div>
    <div class="container">
        <div class="row">
            <div class="col-12 mb-5 card mt-5 shadow">
                <div class="card-body">
                    <h3>Ürün Listesi</h3>
                    <hr>
                    <div v-if="getProducts.length > 0">
                        <table class="table table-hover table-striped table-bordered">
                            <thead>
                            <th>id</th>
                            <th>Ürün Adı</th>
                            <th>Adet</th>
                            <th>Fiyat</th>
                            <th>Açıklama</th>
                            </thead>
                            <tbody>
                            <tr v-for="product in getProducts">
                                <td class="align-middle text-center"><span class="badge badge-info"> {{product.id}}</span></td>
                                <td class="align-middle text-center"> {{product.urunadi}}</td>
                                <td class="align-middle text-center">{{product.adet}}</td>
                                <td style="width: 120px;">{{product.fiyat}}</td>
                                <td class="align-middle">{{product.aciklama}}</td>
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
        name: "urun-listesi",
        data(){
            return{

            }
        },
        computed:{
            ...mapGetters['getProducts'],
        },
    }
</script>

<style scoped>

</style>


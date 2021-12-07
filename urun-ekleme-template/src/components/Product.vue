<template>
    <div v-if="product.length > 0">
        <h3 class="text-center">Eklenen Ürünlerin Listesi</h3>
        <hr>
        <div class="row product-container">
            <div class="col-md-2 card" v-for="products in product">
                <img class="card-img-top" :src="products.productImgUrl == '' ? '/src/assets/default.png' : products.productImgUrl" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">{{products.productName}}</h5>
                    <small>
                        <strong>Adet : </strong> {{products.productNumber}}
                    </small>
                    <br>
                    <small>
                        <strong>Fiyat : </strong> {{products.productPrice}}
                    </small>
                    <br>
                    <small>
                        <strong>Tutar : </strong> {{(products.productNumber * products.productPrice)}}
                    </small>
                </div>
            </div>
        </div>
    </div>
    <div v-else>
        <h3 class="text-center">Henüz Ürün Eklenmemiş!!!</h3>
    </div>

</template>

<script>
    export default {
        props : ['product'],
        data: function () {
            return{
                imgUrl : ""
            }
        }
    }
</script>

<style scoped>

</style>
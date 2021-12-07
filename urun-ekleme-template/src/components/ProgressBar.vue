<template>
    <div>
        <br><br>
        <div class="progress">
            <div class="progress-bar bg-info" role="progressbar" :style="{width: progress + '%'}" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
                {{progress/10}}/10
            </div>
        </div>
        <br><br>
    </div>
</template>

<script>
    export default {
        props:['product'],
        data: function () {
            return{
                progress : 0,
            }
        },
        watch: {
            product(){
                this.progress = this.product.length * 10;
            }
        }
    }
</script>

<style scoped>

</style>
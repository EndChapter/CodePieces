<template>
    <div>
        <div class="form-group col-md-6">
            <label for="name">İsim</label>
            <input type="text" class="form-control" placeholder="İsim" id="name" :value="firstName" @input="nameChanged(true, $event)">
        </div>
        <div class="form-group col-md-6">
            <label for="surName">Soyisim</label>
            <input type="text" class="form-control" placeholder="Soyad" id="surName" :value="lastName" @input="nameChanged(false, $event)">
        </div>
    </div>
</template>

<script>
    export default {
        props:['value'],
        computed:{
            firstName(){
                return this.value.split(' ')[0];
            },
            lastName(){
                return this.value.split(' ')[1];
            }
        },
        methods:{
            nameChanged(isFirst, event){
                let fullName  = "";
                if(isFirst)
                    fullName = event.target.value + ' ' + this.firstName;
                if(!isFirst)
                    fullName = this.lastName + ' ' +  event.target.value;
                this.value = fullName;
                this.$emit('input', this.value)
            }
        }
    }
</script>

<style scoped>

</style>
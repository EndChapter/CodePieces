export const productMixin = {
    data(){
        return{
            products : ['Monitör', "Klavye", "Masa", "Kitap", "Şişe", "Harddisk"],
            searchText: "",
        }
    },
    computed:{
        filtered(){
            return this.products.filter((data)=>{
                return data.match(this.searchText);
            })
        }
    },
    created() {
        console.log('Mixin Created');
    }
}
